package com.fileapp.api;

import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Predicate;

public class App {

	// URI uri=new URI("https://api.ryanair.com/core/3/routes/")
	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
		ExecutorService threadService = Executors.newFixedThreadPool(10);
		Future<? extends Object> data = null;
		try {
			data = threadService.submit(new Callable<Map<String, Integer>>() {
				@Override
				public Map<String, Integer> call() throws Exception {
					return countWord();
				}
			});
		} finally {
			if (threadService != null) {
				threadService.shutdown();
			}
		}

		System.out.println(data.get());
	}

	private static Map<String, Integer> countWord() throws IOException {
		final ReentrantLock lock = new ReentrantLock();
		Map<String, Integer> charMap = new ConcurrentHashMap<String, Integer>();
		if (lock.getHoldCount() == 0) {
			lock.lock();

			// System.err.println(lock.getHoldCount());

			try {
				final String path = "C:\\File\\data.txt";
				String word = readFiles(path);
				Predicate<String> p = s -> s != null;
				ExecutorService executors = Executors.newCachedThreadPool();
				executors.execute(new Runnable() {
					@Override
					public void run() {

						for (String value : word.split(" ")) {
							if (p.test(value)) {
								if (charMap.containsKey(value)) {
									charMap.put(value, charMap.get(value) + 1);
								} else {
									charMap.put(value, 1);
								}
							}

						}

					}
				});

				charMap.entrySet().stream().forEach(System.out::println);
			} finally {
				lock.unlock();
			}
		} else {
			return Collections.emptyMap();
		}

		return charMap;

	}

	@SuppressWarnings("unused")
	private static String readFiles(final String file) throws IOException {
		StringBuilder sb = new StringBuilder();
		String text;
		try (BufferedReader reader = new BufferedReader(new FileReader(new File(file)))) {
			while ((text = reader.readLine()) != null) {
				sb.append(text);

			}
		}
		return sb.toString();

	}

}
