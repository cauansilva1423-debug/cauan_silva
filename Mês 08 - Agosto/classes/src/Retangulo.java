
    public class Retangulo {

        private Double altura;
        private Double largura;

        public Retangulo(Double altura, Double largura) {
            this.altura = altura;
            this.largura = largura;
        }

        @Override
        public String toString() {
            return "Retangulo{" +
                    "altura=" + altura +
                    ", largura=" + largura +
                    '}';
        }

        public Double DescobrirArea(){
            return altura*largura;
        }

        public Double DescobrirPerimetro(){
            return (altura + largura)*2;
        }
    }

