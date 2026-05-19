# BetterShopAuction Medieval UI Pack

Asset-only companion plugin for [BetterShopAuction](../Better-Shop-AuctionHouse) that
swaps the modern dark/cyan theme for a warm **medieval parchment / aged-gold / leather**
look.

This pack ships:

- A custom `BetterShopCommon.ui` with a medieval color palette (parchment cream,
  aged gold, leather brown, hammered iron tones).
- All 45 page-level `.ui` files re-pointing button / container / dropdown /
  input textures from `Textures/ModernShop/...` → `Textures/MedievalShop/...`.
- A texture folder under `Common/UI/Custom/Textures/MedievalShop/` ready for
  medieval-themed PNG art.

## Installation

1. Build the jar: `gradle jar` — produces `build/libs/BetterShopAuctionMedievalUI-1.0.0.jar`.
2. Drop the jar into your server's `mods/` folder alongside `BetterShopAuction`.
3. **Do NOT install** the modern `BetterShopAuctionExtensionsUI` pack at the
   same time — both packs override the same `.ui` paths and will conflict.
   Pick one theme.
4. Restart the server. Open any shop / auction / market UI in-game and verify
   the new theme appears.

## What's currently shipped vs. what you need to provide

The PNG **textures shipped right now are the original modern dark/navy/cyan
textures, copied as a starting point**. The `.ui` overrides and color palette
are already medieval — but until you swap the textures, your UI will mix
medieval-colored labels with modern-style button/container art. To finish the
theme, replace the PNGs in `src/main/resources/Common/UI/Custom/Textures/MedievalShop/`
with medieval art that respects the **same image dimensions and 9-patch border
pixel counts** as the originals.

### Texture inventory (46 files to replace)

#### Buttons (`Patches/Buttons/`)
9-patch borders are `VerticalBorder: 12, HorizontalBorder: 80` for primary /
destructive variants and `Border: 12` for secondary / tertiary.

| File | Suggested medieval art |
|---|---|
| `Primary.png` / `Primary_Hovered.png` / `Primary_Pressed.png` | Carved wood + iron rivets, gold trim glow on hover |
| `Secondary.png` / `Secondary_Hovered.png` / `Secondary_Pressed.png` | Aged parchment paper with sealing wax border |
| `Tertiary.png` / `Tertiary_Hovered.png` / `Tertiary_Pressed.png` / `Tertiary_Active.png` | Leather strap with brass studs |
| `Destructive.png` / `Destructive_Hovered.png` / `Destructive_Pressed.png` | Crimson velvet with iron skull/cross trim |
| `Disabled.png` | Faded greyed-out leather |

#### Container chrome (`Patches/`)
`Border: 23` for content patches, `HorizontalBorder: 35..50` for headers.

| File | Suggested medieval art |
|---|---|
| `ContainerPatch.png` | Aged parchment background with subtle linen weave |
| `ContainerPanelPatch.png` / `ContainerPanelLightPatch.png` | Inner parchment, slight inset shadow |
| `ContainerFullPatch.png` | Full panel with decorated wooden frame |
| `ContainerHeader.png` / `ContainerHeaderNoRunes.png` | Scroll banner header with gold leaf trim |
| `ContainerSectionSeparator.png` | Engraved gold divider with center fleur-de-lys |
| `ContainerCloseButton.png` / `ContainerCloseButtonHovered.png` / `ContainerCloseButtonPressed.png` | Wax seal "X" on parchment |

#### Dropdowns (`Patches/`)

| File | Suggested medieval art |
|---|---|
| `Dropdown.png` / `DropdownHovered.png` / `DropdownPressed.png` | Inset parchment box with wax-stamped border |
| `DropdownBox.png` | Open scroll menu background |
| `DropdownCaret.png` / `DropdownPressedCaret.png` | Engraved gold arrow |

#### Inputs (`Patches/`)

| File | Suggested medieval art |
|---|---|
| `InputBox.png` / `InputBoxHovered.png` / `InputBoxPressed.png` / `InputBoxSelected.png` | Inkwell-stained parchment field |
| `InputBinding.png` | Brass key/scroll binding indicator |

#### Scrollbar (`Patches/`)
`Border: 3`.

| File | Suggested medieval art |
|---|---|
| `Scrollbar.png` | Vertical wood plank with iron tracks |
| `ScrollbarHandle.png` / `ScrollbarHandleHovered.png` / `ScrollbarHandleDragged.png` | Brass slider with stud detail |

#### Rarity slot frames (`Rarities/`)

| File | Suggested medieval art |
|---|---|
| `SlotDefault.png` / `SlotCommon.png` | Plain wooden slot |
| `SlotUncommon.png` | Bronze-trimmed slot |
| `SlotRare.png` | Silver-trimmed slot with sapphire gem |
| `SlotEpic.png` | Gold-trimmed with ruby gem |
| `SlotLegendary.png` | Royal gold with lion crest |
| `SlotJunk.png` | Rusty iron slot |

#### Container decorations (`Decorations/`) — overrides vanilla `Common/`
These are the ornate ribbons rendered at the top and bottom of every
`@DecoratedContainer` (used by **17 pages** — auctions, market, requests, admin
hubs, etc.). Without overrides, the vanilla Hytale ribbon is shown.

| File | Anchor in markup | Suggested medieval art |
|---|---|---|
| `ContainerDecorationTop.png` | `Width: 236, Height: 11, Top: -12` | Engraved gold scroll-top with center fleur-de-lys, flat 9-patch (corners + center stretch) |
| `ContainerDecorationBottom.png` | `Width: 236, Height: 11, Bottom: -6` | Mirror of the top (engraved gold ribbon ending in tassels) |

#### Checkboxes (`CheckBox/`) — overrides vanilla `Common/`
Used in 4 pages (admin / settings / sell-confirm).

| File | Anchor in markup | Suggested medieval art |
|---|---|---|
| `CheckBoxFrame.png` | `22x22 px`, `Border: 7` (9-patch) | Brass-trimmed parchment square frame |
| `Checkmark.png` | `22x22 px` (no patch border) | Wax-stamped seal mark or quill-ink "✓" |

#### Sliders (`Slider/`) — overrides vanilla `Common/`
Used in 1 page (`MarketTrackerPlacement.ui` — height/distance configuration).

| File | Spec | Suggested medieval art |
|---|---|---|
| `SliderBackground.png` | `Border: 2` (9-patch), height ≈ 5px | Iron rail or wood plank with brass tracks |
| `SliderHandle.png` | `16x16 px` (no patch border) | Brass round knob with stud detail |

> **Note**: the placeholder PNGs currently shipped in `Decorations/`,
> `CheckBox/` and `Slider/` are simply copies of other modern textures
> (separator, dropdown caret, scrollbar parts). They render but look wrong.
> Replace them with proper medieval art at the dimensions above for a
> visually coherent theme.

## Color palette (already wired in `BetterShopCommon.ui`)

| Token | Hex | Usage |
|---|---|---|
| `@ColorDefault` | `#f5e8c8` | Parchment cream — main bright text |
| `@ColorDefaultLabel` | `#c9b181` | Faded ink — default labels |
| `@ColorBlueAccent` | `#d4a849` | Aged gold (replaces blue accent) |
| `@ColorBlueAccentHovered` | `#f0c468` | Bright gold (hover) |
| `@ColorBlueAccentPressed` | `#a07a2c` | Dark gold (pressed) |
| `@ColorGoldHighlight` | `#e8a93b` | Highlight gold (titles, important values) |
| `@ColorGrayCaption` | `#9c8463` | Aged leather caption |
| `@ColorButtonText` | `#f1ddb0` | Warm parchment text on buttons |
| `@ColorDisabled` | `#6e5839` | Faded leather (disabled) |
| `@ColorPlaceholder` | `#8c7350` | Sepia placeholder text |
| `@ColorBackgroundCode` | `#1a120a` | Deep wood / sepia |

## Conflicts

This plugin and `BetterShopAuctionExtensionsUI` (modern theme) cannot coexist —
they ship the same `.ui` file paths under `Common/UI/Custom/Pages/`. The Hytale
asset loader picks one and ignores the other unpredictably. Install **only one
theme pack at a time**.

## License

Same as the parent BetterShopAuction project.
