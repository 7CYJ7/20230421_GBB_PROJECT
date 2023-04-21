

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinCalc extends JDialog {
   private JLabel lblDisp;
   private String sNum1 = new String();
   private String sNum2 = new String();
   private String sOp = new String();
   private boolean bStart = true;
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               WinCalc dialog = new WinCalc();
               dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
               dialog.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   

   /**
    * Create the dialog.
    */
   public WinCalc() {
      setTitle("계산기");
      setBounds(100, 100, 322, 339);
      getContentPane().setLayout(null);
      
      lblDisp = new JLabel("");
      lblDisp.setOpaque(true);
      lblDisp.setBackground(new Color(255, 255, 0));
      lblDisp.setHorizontalAlignment(SwingConstants.RIGHT);
      lblDisp.setFont(new Font("굴림", Font.BOLD, 25));
      lblDisp.setBounds(12, 22, 282, 35);
      getContentPane().add(lblDisp);
      
      JButton btnAdd = new JButton("+");
      btnAdd.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            sNum1 = lblDisp.getText();
            lblDisp.setText("");
            sOp = "+";
         }
      });
      btnAdd.setFont(new Font("굴림", Font.BOLD, 20));
      btnAdd.setBounds(12, 67, 62, 37);
      getContentPane().add(btnAdd);
      
      JButton btnSubs = new JButton("-");
      btnSubs.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            sNum1 = lblDisp.getText();
            lblDisp.setText("");
            sOp = "-";
         }
      });
      btnSubs.setFont(new Font("굴림", Font.BOLD, 20));
      btnSubs.setBounds(86, 67, 62, 37);
      getContentPane().add(btnSubs);
      
      JButton btnMul = new JButton("*");
      btnMul.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            sNum1 = lblDisp.getText();
            lblDisp.setText("");
            sOp = "*";
         }
      });
      btnMul.setFont(new Font("굴림", Font.BOLD, 20));
      btnMul.setBounds(160, 67, 62, 37);
      getContentPane().add(btnMul);
      
      JButton btnDiv = new JButton("/");
      btnDiv.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            sNum1 = lblDisp.getText();
            lblDisp.setText("");
            sOp = "/";
         }
      });
      btnDiv.setFont(new Font("굴림", Font.BOLD, 20));
      btnDiv.setBounds(234, 67, 62, 37);
      getContentPane().add(btnDiv);
      
      JButton btn0 = new JButton("0");
      btn0.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if(bStart) {
               lblDisp.setText("");               
               bStart = false;
            }            
            if(!lblDisp.getText().equals(""))
               lblDisp.setText(lblDisp.getText() + "0");
         }
      });
      btn0.setBounds(136, 250, 47, 34);
      getContentPane().add(btn0);
      
      JButton btn1 = new JButton("1");
      btn1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if(bStart) {
               lblDisp.setText("");               
               bStart = false;
            }            
            lblDisp.setText(lblDisp.getText() + "1");
         }
      });
      btn1.setBounds(22, 203, 47, 34);
      getContentPane().add(btn1);
      
      JButton btn2 = new JButton("2");
      btn2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if(bStart) {
               lblDisp.setText("");               
               bStart = false;
            }            
            lblDisp.setText(lblDisp.getText() + "2");
         }
      });
      btn2.setBounds(136, 203, 47, 34);
      getContentPane().add(btn2);
      
      JButton btn3 = new JButton("3");
      btn3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if(bStart) {
               lblDisp.setText("");               
               bStart = false;
            }            
            lblDisp.setText(lblDisp.getText() + "3");
         }
      });
      btn3.setBounds(244, 203, 47, 34);
      getContentPane().add(btn3);
      
      JButton btn5 = new JButton("5");
      btn5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if(bStart) {
               lblDisp.setText("");               
               bStart = false;
            }            
            lblDisp.setText(lblDisp.getText() + "5");
         }
      });
      btn5.setBounds(136, 158, 47, 34);
      getContentPane().add(btn5);
      
      JButton btn4 = new JButton("4");
      btn4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if(bStart) {
               lblDisp.setText("");               
               bStart = false;
            }            
            lblDisp.setText(lblDisp.getText() + "4");
         }
      });
      btn4.setBounds(22, 158, 47, 34);
      getContentPane().add(btn4);
      
      JButton btn8 = new JButton("8");
      btn8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if(bStart) {
               lblDisp.setText("");               
               bStart = false;
            }            
            lblDisp.setText(lblDisp.getText() + "8");
         }
      });
      btn8.setBounds(136, 114, 47, 34);
      getContentPane().add(btn8);
      
      JButton btn7 = new JButton("7");
      btn7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if(bStart) {
               lblDisp.setText("");               
               bStart = false;
            }            
            lblDisp.setText(lblDisp.getText() + "7");
         }
      });
      btn7.setBounds(22, 114, 47, 34);
      getContentPane().add(btn7);
      
      JButton btn9 = new JButton("9");
      btn9.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if(bStart) {
               lblDisp.setText("");               
               bStart = false;
            }            
            lblDisp.setText(lblDisp.getText() + "9");
         }
      });
      btn9.setBounds(244, 114, 47, 34);
      getContentPane().add(btn9);
      
      JButton btn6 = new JButton("6");
      btn6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if(bStart) {
               lblDisp.setText("");               
               bStart = false;
            }            
            lblDisp.setText(lblDisp.getText() + "6");
         }
      });
      btn6.setBounds(244, 158, 47, 34);
      getContentPane().add(btn6);
      
      JButton btnClear = new JButton("C");
      btnClear.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            lblDisp.setText(""); // 내용 다 지우기
         }
      });
      btnClear.setFont(new Font("굴림", Font.BOLD, 20));
      btnClear.setBounds(12, 256, 62, 37);
      getContentPane().add(btnClear);
      
      JButton btnResult = new JButton("=");
      btnResult.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            sNum2 = lblDisp.getText();  // lblDisp에 있는 숫자를 가져와서 sNum2에 넣는다.
            double result = 0;
            switch(sOp) {
            case "+": 
               result = Integer.parseInt(sNum1) + Integer.parseInt(sNum2); 
               break;
            case "-":
               result = Integer.parseInt(sNum1) - Integer.parseInt(sNum2);
               break;
            case "*":
               result = Integer.parseInt(sNum1) * Integer.parseInt(sNum2);
               break;
            case "/":
               result = (double)Integer.parseInt(sNum1) / Integer.parseInt(sNum2);
               break;
            }
            lblDisp.setText(Double.toString(result));
            bStart = true;
         }
      });
      btnResult.setFont(new Font("굴림", Font.BOLD, 20));
      btnResult.setBounds(232, 256, 62, 37);
      getContentPane().add(btnResult);

   }

}