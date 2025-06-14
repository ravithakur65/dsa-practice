package dsa.practice.array;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class CustomRateLimiter {
    private final int MAX_REQUESTS;
    private final long WINDOW_SIZE_MS;

    private final Map<String, Deque<Long>> requestLog = new HashMap<>();

    public CustomRateLimiter(int maxRequests, long windowSizeInMillis) {
        this.MAX_REQUESTS = maxRequests;
        this.WINDOW_SIZE_MS = windowSizeInMillis;
    }

    // You can use IP/user ID/request type as key
    public synchronized boolean allowRequest(String key) {
        long now = System.currentTimeMillis();
        Deque<Long> timestamps = requestLog.computeIfAbsent(key, k -> new ArrayDeque<>());

        // Remove outdated timestamps outside the window
        while (!timestamps.isEmpty() && now - timestamps.peekFirst() >= WINDOW_SIZE_MS) {
            timestamps.pollFirst();
        }

        if (timestamps.size() < MAX_REQUESTS) {
            timestamps.addLast(now);
            return true;
        }

        return false;
    }

    // Example usage
    public static void main(String[] args) throws InterruptedException {
        CustomRateLimiter limiter = new CustomRateLimiter(100, 60_000); // 100 requests per 60 seconds
        String user = "client-ip-1";

        for (int i = 0; i < 105; i++) {
            if (limiter.allowRequest(user)) {
                System.out.println("Request " + (i + 1) + ": Allowed");
            } else {
                System.out.println("Request " + (i + 1) + ": Blocked");
            }
        }
    }
}
