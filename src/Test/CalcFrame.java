package Test;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;

public class CalcFrame extends JFrame implements ActionListener {
    JLabel label;           // 연산 결과창
    boolean state = false; // 화면에 표시된 number 핸들러
    double num1, num2;
    double result;         // 연산 결과
    String func = "";     // 기능 연산자
    String nInput = "";   // 마지막에 누른 연산자 저장

    String btn[] = { "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9",
            "*", "0","", "=", "/"};        // 버튼 안에 값 배열


    public CalcFrame() {

        super("Calculator"); // title 지정
        super.setResizable(true); // 프레임의 크기를 사용자가 조절

        /*
         * JFrame : 메인 프레임 JPanel : 보조 프레임 JLabel : 기능을 수행하는 컴포넌트
         */

        // 결과 창 GUI
        label = new JLabel("0", JLabel.RIGHT); // ("첫화면 출력될 값", 위치)

        JPanel mainView = new JPanel();
        label.setFont(new Font(" ", Font.BOLD, 50)); // Font 지정
        label.setBackground(Color.WHITE); // 결과창 배경색 지정
        label.setOpaque(true); // 배경색을 적용하기 위해 불투명 설정

        // 버튼 창 GUI
        JPanel btnView = new JPanel();

        btnView.setLayout(new GridLayout(4, 4, 2, 2)); // 행과 열로 구성된 레이아웃 설정 (row, cols, 간격, 간격)

        JButton button[] = new JButton[btn.length]; // 버튼 생성, 배열의 길이만큼 값을 가져옴

        for (int i = 0; i < btn.length; i++) {
            button[i] = new JButton(btn[i]);//버튼 배열 안에 설정한 btn배열 값 대입
            button[i].setFont(new Font(" ", Font.BOLD, 25)); // Font 지정
            button[i].addActionListener(this); // 익명클래스로 버튼 이벤트 추가 ,이벤트 리스너의 객체이므로 this로 지정

            if (i >= 0 && i <= 3) {
                button[i].setForeground(Color.white);// 폰트 색 지정
                button[i].setBackground(Color.blue);// 버튼 색 지정
            }else {
                button[i].setForeground(Color.black);//나머지 버튼 색 지정
            }
            btnView.add(button[i]);//버튼 설정

        }

        // 프레임 배치 및 설정
        mainView.setLayout(new BorderLayout()); // 동서남북 레이아웃 배치
        add(label, BorderLayout.CENTER); // 결과창 배치
        add(btnView, BorderLayout.SOUTH); // 버튼창 베치

        setBounds(100, 100, 300, 400); // 프레임의 크기 지정
        setDefaultCloseOperation(EXIT_ON_CLOSE); // X버튼을 누르면 닫히는 설정
        setVisible(true); // 프레임이 보이도록 설정

    }

// 마우스 클릭에 의한 동작

    @Override
    public void actionPerformed(ActionEvent e) {

        String input = e.getActionCommand(); // 이벤트를 발생시킨 객체의 문자열을 가져와서 input에 넣음

        if (input.equals("+")) {
            num1 = num2;
            func = "+";
            nInput = ""; // 마지막에 누른 연산자 저장

        } else if (input.equals("-")) {
            num1 = num2;
            func = "-";
            nInput = "";

        } else if (input.equals("×")) {
            num1 = num2;
            func = "×";
            nInput = "";

        } else if (input.equals("÷")) {
            num1 = num2;
            func = "÷";
            nInput = "";

        } else if (input.equals("%")) {
            num1 = num2;
            func = "%";
            nInput = "";
            result = num1 / 100;
            label.setText(String.valueOf(result)); //결과값을 문자열로 반환하여 결과창에 출력
        }

         else if (input.equals("=")) {
            if (func.equals("+")) {
                result = num1 + num2;
                label.setText(String.valueOf(result)); //결과값을 문자열로 반환하여 결과창에 출력
                state = true; // 결과 값이 나온 후 다음 입력이 들어왔을 때 화면에 표시된 결과 값을 지운다.

            } else if (func.equals("-")) {
                result = num1 - num2;
                label.setText(String.valueOf(result));
                state = true;

            } else if (func.equals("×")) {
                result = num1 * num2;
                label.setText(String.valueOf(result));
                state = true;

            } else if (func.equals("÷")) {
                result = num1 / num2;
                label.setText(String.valueOf(result));
                state = true;

            }

        } else {
            if (state) {
                label.setText("0");
                state = false;
                num1 = 0;
                num2 = 0;
                nInput = "";
            }

            nInput += e.getActionCommand();
            label.setText(nInput);
            num2 = Double.parseDouble(nInput); //문자열에서 double형 변

        }

    }
}

