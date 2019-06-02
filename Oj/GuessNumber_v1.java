package tw.hank;

import javax.swing.JOptionPane;

public class GuessNumber_v1 {

	public static void main(String[] args) {
			//寫出美猜一次勝幾次
			//在show(null,歷史紀錄)
				//1.產生謎底 creat answe
				String answer = createAnswer();
				
				//2.使用者互動
				boolean isWinner = false;
				for (int i=0; i<3; i++) {
					String guess = JOptionPane.showInputDialog("輸入數字"); //3.詢問你猜多少
					String result = checkAB(answer, guess);
					JOptionPane.showMessageDialog(null, result);
					if (result.equals("3A0B")) {//4.輸入完後match比對
						isWinner = true;
					}
				}
				//5如果猜對恭喜,沒猜對繼續跑,迴圈只有10圈
				JOptionPane.showMessageDialog(null, isWinner?"Winner":"Loser");
			}
			
			static String createAnswer() {
				return "217";
			}
			
			static String checkAB(String a, String g) {
				return "1A2B";
			}
			
		}