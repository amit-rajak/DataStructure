import java.util.Scanner;

import java.util.*;

public class ShortestPathWithToll {
    static class Road {
        int dest, length, toll;

        Road(int dest, int length, int toll) {
            this.dest = dest;
            this.length = length;
            this.toll = toll;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();

        for (int country = 0; country < M; country++) {
            int C = sc.nextInt();
            int N = sc.nextInt();
            int R = sc.nextInt();

            List<List<Road>> graph = new ArrayList<>();
            for (int i = 0; i <= N; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0; i < R; i++) {
                int S = sc.nextInt();
                int D = sc.nextInt();
                int L = sc.nextInt();
                int T = sc.nextInt();
                graph.get(S).add(new Road(D, L, T));
            }

            int result = findShortestPath(graph, N, C);
            System.out.println(result);
        }
    }

    private static int findShortestPath(List<List<Road>> graph, int N, int C) {
        int[][] dist = new int[N + 1][C + 1];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        dist[1][0] = 0; // Start from city 1 with 0 toll spent

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{1, 0, 0}); // {city, distance, tollSpent}

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int city = curr[0];
            int distance = curr[1];
            int tollSpent = curr[2];

            if (city == N) return distance;

            for (Road road : graph.get(city)) {
                int nextCity = road.dest;
                int nextDistance = distance + road.length;
                int nextToll = tollSpent + road.toll;

                if (nextToll <= C && nextDistance < dist[nextCity][nextToll]) {
                    dist[nextCity][nextToll] = nextDistance;
                    pq.offer(new int[]{nextCity, nextDistance, nextToll});
                }
            }
        }

        return -1;
    }
}
