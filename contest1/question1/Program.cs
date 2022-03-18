namespace Algorithm
{
    public class Program
    {
        static void Main(string[] args)
        {
            int t = Convert.ToInt32(Console.ReadLine());
            for (int i = 0; i < t; i++)
            {
                char[] binaryString = Console.ReadLine().ToCharArray();
                for (int j = binaryString.Length - 1; j >= 0; j--)
                {
                    if (binaryString[j] == '0')
                    {
                        binaryString[j] = '1';
                        break;
                    }
                    else
                    {
                        binaryString[j] = '0';
                    }
                }
                Console.WriteLine(binaryString);
            }
        }
    }
}