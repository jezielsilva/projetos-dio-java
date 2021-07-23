/*Um cliente tem 10 dias para pagar uma fatura após sua data de vencimento
* sem que os juros sejam cobrados.
*
* Caso essa data caia em um sábado ou domingo, o cliente pode pagar
* na segunda-feira seguinte.
*
* Crie uma estrutura que receba uma data de vencimento
* e calcule quantos dias ele tem para pagar.
* */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.*;

public class vencimentoDeUmaFatura {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String data;

        System.out.println(">>> Vencimento de Faturas <<<");
        System.out.println("Digite a data de vencimento separando por barras como no exemplo abaixo: ");
        System.out.println("DD/MM/YYYY");
        data = sc.nextLine();
        CalculoDoVencimento(data);
        sc.close();
    }
    public static void CalculoDoVencimento(String data) throws ParseException {
        GregorianCalendar gc = new GregorianCalendar();
        /*Essa classe auxilia nas transformações de string para Date e vice-versa,
        além de dar mais poder de manipulação.*/
        gc.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(data));
        //Insere a string data que veio do usuário dentro da variável gc para manipulação.
        Calendar dataVencimento = gc;
        //Variável criada para fazer as comparações e descobrir qual o dia da semana.
        dataVencimento.add(Calendar.DATE, 10);
        //10 dias são acrescentados a data para descobrir o dia de vencimento.

        switch (dataVencimento.get(Calendar.DAY_OF_WEEK)) {
                case Calendar.SUNDAY:
                    dataVencimento.add(Calendar.DATE, 1);
                    System.out.println("Data de Vencimento será: "+ dataVencimento.getTime());
                    break;
                case Calendar.MONDAY:
                    System.out.println("Data de Vencimento será: "+ dataVencimento.getTime());
                    break;
                case Calendar.TUESDAY:
                    System.out.println("Data de Vencimento será: "+ dataVencimento.getTime());
                    break;
                case Calendar.WEDNESDAY:
                    System.out.println("Data de Vencimento será: "+ dataVencimento.getTime());
                    break;
                case Calendar.THURSDAY:
                    System.out.println("Data de Vencimento será: "+ dataVencimento.getTime());
                    break;
                case Calendar.FRIDAY:
                    System.out.println("Data de Vencimento será: "+ dataVencimento.getTime());
                    break;
                case Calendar.SATURDAY:
                    dataVencimento.add(Calendar.DATE, 2);
                    System.out.println("Data de Vencimento será: "+ dataVencimento.getTime());
                    break;
            default:
                throw new IllegalStateException("Unexpected value: " + dataVencimento.get(Calendar.DAY_OF_WEEK));
        }
    }
}


