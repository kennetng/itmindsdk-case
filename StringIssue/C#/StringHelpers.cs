using System.Collections.Generic;

namespace StringIssue
{
    public static class StringHelpers
	{
		/// <summary>
		/// Method that does not perform well.
		/// </summary>
		/// <param name="strs"></param>
		/// <returns></returns>
		public static string MergeStrings(IEnumerable<string> strs)
		{
			var toReturn = "";
			foreach (var str in strs)
			{
				toReturn += str;
			}
			return toReturn;
		}
	}
}

/* Explain why your solution is faster below this line

*/
