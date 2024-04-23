// public class ForEmArray {
//     public static void main(String[] args) {
//         String alunos[] = {"FELIPE", "JONAS", "ANA", "JÚLIA", "MARCOS"};

//         for (int i = 0; i < alunos.length; i++) {
//             System.out.println("O aluno no indice i= " + i + " é " + alunos);
//         }
//     }
    
// }

/**
 * ForEmArray
 */
public class ForEmArray {

    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "ANA", "JÚLIA", "MARCOS"};

        for(String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}