using System.Collections.Generic;

namespace StolenTests
{
    public interface INumberHelper
    {
        /// <summary>
        /// Find a node that satisfy a given predicate and return it.
        /// </summary>
        /// <param name="needle">Number that is searched for</param>
        /// <param name="haystack">Collection of numbers that are searched through</param>
        /// <param name="n">The amount of numbers close to needle that should be returned</param>
        /// <returns>A collection with the n numbers in haystack closest to needle</returns>
        IEnumerable<int> FindClosestNumbers(int needle, IEnumerable<int> haystack, int n);
    }
}
