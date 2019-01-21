public class countNumber {
    public static void main(String[] args)
    {
        String dna = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
        int num = dna.length();
        int countA = 0;
        int countT = 0;
        int countC = 0;
        int countG = 0;
        for (int i = 0; i < num; i++)
        {
            char temp = dna.charAt(i);
            if (temp == 'A')
            {
                countA++;
            }
            else if (temp == 'T')
            {
                countT++;
            }
            else if (temp == 'C')
            {
                countC++;
            }
            else {
                countG++;
            }
        }
        System.out.printf("A: %d\n",countA);
        System.out.printf("T: %d\n",countT);
        System.out.printf("C: %d\n",countC);
        System.out.printf("G: %d\n",countG);
    }
}
