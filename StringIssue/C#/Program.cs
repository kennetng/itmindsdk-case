using System;
using System.Collections.Generic;
using System.Linq;

namespace StringIssue
{
    public class Program
	{
        public static void Main(string[] args)
		{
			Console.WriteLine("Filling array: ");
			var strs = Fill(40000).ToList();
			{
				Console.WriteLine("Executing inefficient String-Helper method: ");
				var before = DateTime.Now;
				var output = StringHelpers.MergeStrings(strs);
				var after = DateTime.Now;
				Console.WriteLine($"Length: {output.Length}");
				Console.WriteLine("Elapsed time: " + (after - before).TotalMilliseconds);
			}
			Console.ReadLine();
		}

		private static IEnumerable<string> Fill(int n)
		{
			var strs = new string[n];
			for (var i = 0; i < n; i++)
			{
				strs[i] = i + "";
			}
			return strs;
		}
	}
}
