package it.unipv.ingsw.blackmarket;


/**
 * A dealer in the black market.
 */
public abstract class Dealer {
    /// Money made so far.
    private int coins = 0;

    /**
     * Get the name of the Dealer.
     */
    public final String getName() {
        /// Since we plan to have only one dealer for each class, we use the name of the class.
        return this.getClass().getSimpleName();
    }

    /**
     * Return the profit made by this dealer in its trading activities.
     */
    public final int getCoins() {
        return coins;
    }

    /**
     * Add some money to the profit of the dealer.
     */
    public final void addCoins(int amount) {
        coins += amount;
    }

    /**
     * Ask the dealer which briefcase is going to exchange with its business partner.
     * @param roundNo progressive number for the current exchange (between 1 and totRounds)
     * @param totRounds total number of rounds that will form this sequence of exchanges
     * @return the briefcase to be exchanged
     */
    abstract public Briefcase exchangeBriefcase(int roundNo, int totRounds);

    /**
     * Inform the dealer of the outcome of the last exchange.
     *
     * Note that this dealer is always the first one in the exchange object.
     *
     * @param exchange the last exchange
     * @param roundNo number of exchanges already done, between 1 and totRounds
     * @param totRounds number of exchanges in the series
     */
    public void exchangeResult(Exchange exchange, int roundNo, int totRounds) {
        // By default, do nothing.
        // Derived classes may use this method to gather information for future exchanges.
    }
}
