import java.util.*;

public class ClimibingTheLeaderBoard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        Set<Integer> uniqueScores = new HashSet<>();

        for (int i = 0; i < n; i++) {
            scores[i] = in.nextInt();
            uniqueScores.add(scores[i]);
        }

        List<Integer> uniqueScoresList = new ArrayList<>(uniqueScores);
        Collections.sort(uniqueScoresList, Collections.reverseOrder());
        //System.out.println(uniqueScoresList);

        int m = in.nextInt();

        int[] players = new int[m];

        for (int u = 0; u < m; u++) {
            players[u] = in.nextInt();

            int position = Collections.binarySearch(uniqueScoresList, players[u], Collections.reverseOrder());

            if (position < 0) {
                System.out.println(Math.abs(position));
            } else {
                //System.out.printf("maeen");
                position = position + 1;
                System.out.println(position);
            }

        }
    }
}
