package CreationalDesignPattren.biulder.problem1;


 class Burger {
        private String bun;
        private String patties;
        private boolean lettuce;
        private boolean tomato;
        private boolean onion;
        private boolean cheese;

        public void setBun(String bun) {
               this.bun = bun;
        }

        public void setPatties(String patties) {
               this.patties = patties;
        }

        public void setLettuce(boolean lettuce) {
               this.lettuce = lettuce;
        }

        public void setTomato(boolean tomato) {
               this.tomato = tomato;
        }

        public void setOnion(boolean onion) {
               this.onion = onion;
        }

        public void setCheese(boolean cheese) {
               this.cheese = cheese;
        }

        public void showBurger() {
               System.out.println("🍔 Your Custom Burger:");
               System.out.println("- Bun: " + bun);
               System.out.println("- Patties: " + patties);
               System.out.println("- Lettuce: " + (lettuce ? "Yes" : "No"));
               System.out.println("- Tomato: " + (tomato ? "Yes" : "No"));
               System.out.println("- Onion: " + (onion ? "Yes" : "No"));
               System.out.println("- Cheese: " + (cheese ? "Yes" : "No"));
        }
 }
