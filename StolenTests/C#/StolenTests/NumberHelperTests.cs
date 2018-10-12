using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;

namespace StolenTests
{
    [TestClass]
    public class NumberHelperTests
    {
        /*
         * This section contains a very basic test example
         * The test in this document should be re-written, as it does not represent best practices
         */

        [TestMethod]
        public void TestExample()
        {
            // Arrange
            var haystackExample = new List<int> { 1, 2, 3 };

            const int needle = 1;
            var helper = new NumberHelper();

            // Act
            var results = helper.FindClosestNumbers(needle, haystackExample, 1).ToList();

            // Assert
            Assert.Equals(results.ElementAt(0), 1);
        }
    }
}
