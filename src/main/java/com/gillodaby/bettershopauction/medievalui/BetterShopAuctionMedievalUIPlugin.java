package com.gillodaby.bettershopauction.medievalui;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

/**
 * Asset-only companion plugin for {@code BetterShopAuction}.
 *
 * <p>Ships overriding {@code .ui} files (every page that touches a
 * background patch or button texture) plus a medieval texture set
 * under {@code Common/UI/Custom/Textures/MedievalShop/Patches/}. When
 * this plugin is installed alongside the main {@code BetterShopAuction}
 * plugin, the engine resolves the duplicated resource paths in favour
 * of this plugin's copies — every container patch, panel patch,
 * button state and section separator switches to the warm medieval
 * parchment / gold / iron theme.</p>
 *
 * <p>Removing this plugin makes the main plugin fall back to the
 * vanilla Hytale game-asset look automatically. Nothing here is
 * required for the main plugin's logic — it's pure visual override.</p>
 *
 * <p><strong>Conflicts</strong>: do not install alongside the
 * {@code BetterShopAuctionExtensionsUI} (modern theme) plugin —
 * both packs override the same {@code .ui} file paths. Pick one.</p>
 */
public final class BetterShopAuctionMedievalUIPlugin extends JavaPlugin {

    public BetterShopAuctionMedievalUIPlugin(JavaPluginInit init) {
        super(init);
        // Resources (textures + .ui overrides) are loaded automatically
        // from the jar's `Common/UI/Custom/` tree by the engine. There
        // is no runtime registration to perform.
    }
}
