using System.Collections.Generic;

namespace SecretAgent
{
	public interface IFindSecretAgent
	{
		int StartSearch(IEnumerable<int> ids);
    }
}
