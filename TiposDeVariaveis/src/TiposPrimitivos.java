public class TiposPrimitivos {

    public static void main(String[] args) {
        byte a = 9;
        System.out.println(a);  

        int numeroInteiro = 10;
        int b = 10, c = 20, soma; // inicialização de variáveis inline
        soma = b + c; // atribuição da soma da variável a + b para a variável soma
        System.out.println(numeroInteiro); // 10
        System.out.println(soma); // 30

        long numA = 102040;
        long numB = 102030405060L; // adicionado L no final para indicar que estamos inserindo um valor do tipo long
        System.out.println(numA);
        System.out.println(numB);

        float numC = -101.23f;
        float numD = 2.356f;
        System.out.println(numC + numD); // -98.874

        // double varDouble = 2.356; // double inicializado naturalmente
        double doubleRecebendoFloat = 1.409F; // double aceitando número float
        double doubleRecebendoLong = 12930L; // double aceitando número long
        System.out.println(doubleRecebendoFloat); // 1.409000039100647
        System.out.println(doubleRecebendoLong); // 12930.0

        // boolean isBoolean = true; // outros exemplos: isGreaterThan, isFlexible, isStarted
        // boolean ehNumero = false; // outros exemplos: ehMaiorDeIdade, ehCedo, ehValido

        char letraA = 'a';
        char letraAMaiuscula = 'A';
        System.out.println(letraA); // a
        System.out.println(letraAMaiuscula); // A
    }
    

}