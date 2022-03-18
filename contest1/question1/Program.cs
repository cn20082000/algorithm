namespace Algorithm
{
    public class Program
    {
        static void Main(string[] args)
        {
            int t = Convert.ToInt32(Console.ReadLine());
            for (int i = 0; i < t; i++)
            {
                string binaryString = Console.ReadLine();
                for (int j = binaryString.Length - 1; j >= 0; j--)
                {
                    if (binaryString[j] == '0')
                    {
                        binaryString = binaryString.Remove(j, 1);
                        binaryString = binaryString.Insert(j, "1");
                        break;
                    }
                    else
                    {
                        binaryString = binaryString.Remove(j, 1);
                        binaryString = binaryString.Insert(j, "0");
                    }
                }
                Console.WriteLine(binaryString);
            }
        }
    }
}