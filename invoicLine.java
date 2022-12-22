package model;

public class invoicLine {
        private String itemName;
        private double itemPrice;
        private int itemCount;
        private double lineTotal;

        public invoicLine (String itemName, double itemPrice, int itemCount) {
            this.itemName = itemName;
            this.itemPrice = itemPrice;
            this.itemCount = itemCount;
            this.setLineTotal(this.itemCount*this.itemPrice);
        }



        public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public double getItemPrice() {
            return itemPrice;
        }

        public void setItemPrice(double itemPrice) {
            this.itemPrice = itemPrice;
        }

        public int getItemCount() {
            return itemCount;
        }

        public void setItemCount(int itemCount) {
            this.itemCount = itemCount;
        }

        public double getLineTotal(){
            return lineTotal;
        }

        private void setLineTotal(double lineTotal) {
            this.lineTotal = lineTotal;
        }
        public String getDataAsCSV() {
            return "," + getItemName() + "," + getItemPrice() + "," + getItemCount();
        }
    }

