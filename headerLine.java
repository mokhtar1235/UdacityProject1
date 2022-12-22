package model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class headerLine {
        private int invNum;
        private String customerName;
        private Date invDate;
        private ArrayList<invoicLine> lines;



        public headerLine(int invNum, String customerName, Date invDate) {
            this.invNum = invNum;
            this.customerName = customerName;
            this.invDate = invDate;
            // this.lines = new ArrayList<>();
        }

        public Date getInvDate() {
            return invDate;
        }

        public void setInvDate(Date invDate) {
            this.invDate = invDate;
        }

        public int getInvNum() {
            return invNum;
        }

        public void setInvNum(int invNum) {
            this.invNum = invNum;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        @Override
        public String toString() {
            String str="InvoiceFram1{" + "invNum=" + invNum + ", customerName=" + customerName + ", invDate=" + invDate + '}' ;
            for(invoicLine line: getLines()){
                str += "\n\t" + line;
            }
            return str;
        }

        public ArrayList<invoicLine> getLines() {
            if (lines == null)
                lines = new ArrayList<>();
            return lines;
        }

        public void setLines(ArrayList<invoicLine> lines) {
            this.lines = lines;
        }

        public double getInvTotal() {
            double total = 0.0;
            for (invoicLine line : getLines()){
                total += line.getLineTotal();
            }
            return total;
        }

        public void addInvLine(invoicLine line){
            getLines().add(line);

        }
        public String getDataAsCSV() {
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            return "" + getInvNum() + "," + df.format(getInvDate()) + "," + getCustomerName();
        }
    }

