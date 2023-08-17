/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio_lanchonete_2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author sarin
 */
public class Desafio_Lanchonete_2023 {

    public static void main(String[] args) {
        int cod, qtd, opMenu, tpPGTO;
        float calcularValorDaCompra = 0, desconto = 0, acrescimo = 0;

        Scanner leia = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("=================================================================");
        System.out.println("                             CÁRDAPIO                            ");
        System.out.println("=================================================================");
        System.out.println("|  CODIGO           | DESCRIÇÂO                     |  VALOR    |");
        System.out.println("|  10 - (cafe)      | Café                          |  R$ 3,00  |");
        System.out.println("|  11 - (chantily)  | Chantily (extra do Café)      |  R$ 1,50  |");
        System.out.println("|  12 - (suco)      | Suco Natural                  |  R$ 6,20  |");
        System.out.println("|  13 - (sanduiche) | Sanduíche                     |  R$ 6,50  |");
        System.out.println("|  14 - (queijo)    | Queijo (extra do Sanduíche)   |  R$ 2,00  |");
        System.out.println("|  15 - (salgado)   | Salgado                       |  R$ 7,25  |");
        System.out.println("|  16 - (combo1)    | 1 Suco e 1 Sanduíche          |  R$ 9,50  |");
        System.out.println("|  17 - (combo2)    | 1 Café e 1 Sanduíche          |  R$ 7,50  |");
        System.out.println("=================================================================");
        System.out.println("            1 - VENDA            |           2 - FECHAR          ");
        System.out.println("=================================================================");
        System.out.println("\nEscolha uma das opções: ");
        opMenu = leia.nextInt();

        System.out.println("\n");
        System.out.println("\nFORMAS DE PAGAMENTO");
        System.out.println("\n1 . Dinheiro - tem desconto de 5%");
        System.out.println("\n2 . Dívida");
        System.out.println("\n3 . Crédito - tem acréscimo de 3% no valor total\n");
        System.out.println("\nEscolha uma das formas de pagamento: ");
        tpPGTO = leia.nextInt();

        while (opMenu != 2) {
            if (opMenu == 1) {
                System.out.print("\nDigite o código do produto: ");
                cod = leia.nextInt();

                System.out.print("\nDigite a quantidade: ");
                qtd = leia.nextInt();

                if (qtd > 0) {
                    switch (cod) {
                        case 10:
                            calcularValorDaCompra += qtd * 3;
                            break;
                        case 11:
                            calcularValorDaCompra += qtd * 1.50;
                            break;
                        case 12:
                            calcularValorDaCompra += qtd * 6.20;
                            break;
                        case 13:
                            calcularValorDaCompra += qtd * 6.50;
                            break;
                        case 14:
                            calcularValorDaCompra += qtd * 2.00;
                            break;
                        case 15:
                            calcularValorDaCompra += qtd * 7.25;
                            break;
                        case 16:
                            calcularValorDaCompra += qtd * 9.50;
                            break;
                        case 17:
                            calcularValorDaCompra += qtd * 7.50;
                            break;
                        default:
                            System.out.println("\nItem inválido!");
                            break;
                    }
                } else {
                    System.out.println("\nQuantidade inválida!");
                }
            } else {
                System.out.println("\nOpção inválida");
            }

            System.out.println("\nEscolha uma das opções: ");
            opMenu = leia.nextInt();
        }

        if (tpPGTO == 1) {
            desconto = calcularValorDaCompra * 0.05f;
            calcularValorDaCompra -= desconto;
        } else if (tpPGTO == 3) {
            acrescimo = calcularValorDaCompra * 0.03f;
            calcularValorDaCompra += acrescimo;
        }

        System.out.printf("\nValor total do pedido R$ %.2f\n", calcularValorDaCompra);

    }
}
