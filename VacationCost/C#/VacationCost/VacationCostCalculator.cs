using System;

namespace VacationCost
{
    public class VacationCostCalculator
    {
        public double DistanceToDestination { get; set; }

        public decimal CostOfVacation(string transportMethod)
        {
            switch (transportMethod)
            {
                case "Car":
                    return (decimal) (DistanceToDestination * 1);
                case "Plane":
                    return (decimal) (DistanceToDestination * 2);
                default:
                    throw new ArgumentOutOfRangeException();
            }
        }
    }
}
