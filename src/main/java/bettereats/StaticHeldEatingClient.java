package bettereats;

import net.fabricmc.api.ClientModInitializer;

public class StaticHeldEatingClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // No init needed; mixin handles rendering behavior.
    }
}
