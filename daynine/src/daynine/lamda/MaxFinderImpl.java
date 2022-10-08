package daynine.lamda;

public class MaxFinderImpl implements MaxFinder {

	@Override
	public int maximum(int arg1, int arg2) {
		return arg1>arg2?arg1:arg2;
	}

}
