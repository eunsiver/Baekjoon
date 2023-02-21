
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	
		int N = Integer.parseInt(br.readLine());
		int num = Integer.parseInt(br.readLine());
		ArrayList<String> broken = new ArrayList<>();
		if (num == 0) {
			System.out.println(Math.min(Math.abs(N - 100), String.valueOf(N).length()));
			return;
		}
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			broken.add((st.nextToken()));
		}
		// 입력완료

		int result = Math.abs(N - 100);
		boolean isBroken;
		for (int i = 0; i < 999999; i++) {
			isBroken = false;

			String str = String.valueOf(i);
			int len = str.length();

			for (int j = 0; j < broken.size(); j++) {
				String get = broken.get(j);
				if (str.contains(get)) {
					isBroken = true;
					break;
				}

			}
			if (!isBroken) {
				int min = len + Math.abs(N - i);
				result = Math.min(min, result);
			}
		}
		System.out.println(result);
	}

}
