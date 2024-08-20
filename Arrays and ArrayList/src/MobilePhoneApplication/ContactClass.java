package MobilePhoneApplication;

public class ContactClass {


        private String name;
        private int number;

        public ContactClass(String name, int number) {
            this.name = name;
            this.number = number;
        }

        // Getters and setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
}
