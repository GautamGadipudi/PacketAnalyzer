package IP;

public class Flags {

    public Flags(short value) {
        this.value = value;

    }

    /**
     * 4 Byte value of flags.
     */
    private short value;

    /**
     * Dont fragment bit.
     */
    private boolean dontFragment;

    /**
     * Are more fragments there.
     */
    private boolean moreFragments;

    /**
     * Set more fragments flag.
     * @param moreFragments
     */
    public void setMoreFragments(boolean moreFragments) {
        this.moreFragments = moreFragments;
    }

    /**
     * Set dont fragment flag.
     * @param dontFragment
     */
    public void setDontFragment(boolean dontFragment) {
        this.dontFragment = dontFragment;
    }

    /**
     * Dont Fragment?
     * @return
     */
    public boolean isDontFragment() {
        return dontFragment;
    }

    /**
     * More fragments?
     * @return
     */
    public boolean isMoreFragments() {
        return moreFragments;
    }

    @Override
    public String toString() {
        String result = this.value;
        String
    }
}
