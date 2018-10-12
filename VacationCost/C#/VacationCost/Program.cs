using System;

namespace VacationCost
{
    class Program
    {
        static void Main(string[] args)
        {
            if(args.Length < 2)
            {
                Console.WriteLine("Not enough input arguments to run this program");
                Console.ReadLine();
            }
            else
            {
                var transportMethod = args[0];
                var distance = args[1];
                var calculator = new VacationCostCalculator { DistanceToDestination = double.Parse(distance) };
                var result = calculator.CostOfVacation(transportMethod);
                Console.WriteLine(result);
                Console.ReadLine();
            }
        }
    }
}
