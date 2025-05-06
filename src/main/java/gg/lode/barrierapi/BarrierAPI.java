package gg.lode.barrierapi;

/**
 * Official API of the Barrier Plugin
 * This interface allows access to certain internals of the world border plugin.
 *
 * @author John Aquino
 */
public class BarrierAPI {

    private static IBarrierAPI api;

    /**
     * Internal use of the API for Barrier to use.
     * DO NOT TOUCH!!
     * @param api {@link IBarrierAPI}
     */
    public static void setApi(IBarrierAPI api) {
        BarrierAPI.api = api;
    }

    /**
     * Retrieves the API that Barrier uses.
     */
    public static IBarrierAPI getApi() {
        return api;
    }

}
