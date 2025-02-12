package me.zero.skyblock.inventory.inventories;

import me.zero.skyblock.inventory.*;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class MysteryVaultGUI extends GUI {

    @Override
    public String getTitle() {
        return "Mystery Vault";
    }

    @Override
    public int getSize() {
        return 54;
    }

    @Override
    public void onClick(InventoryClickEvent event) {

        if (event.getCurrentItem() == null) { return; }

        event.getWhoClicked().sendMessage("§cThis is not currently available! Please check back soon!");
        event.setCancelled(true);
    }

    @Override
    public void onClose(InventoryCloseEvent event) {

    }
    
    

    @Override
    public void setItems() {

        inventory.setItem(47, makeTexturedSkullItem("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGVmMGVkOWQ1ODY1ZjE5Nzc5NzMxZjhhYWI1YTg5YzJkYjJjNjkyZWQyN2JkNGFhNGE5MjgyMmQ1MDc2ZGZmNyJ9fX0=", "§aGift Inventory", 1, "§7Send gifts to your friends and\n§7claim unique rewards in return!\n\n§7Purchase gift packs on our store at\n§bhttps://store.SkyblockGame.net\n\n§7Gift packs you purchase will\n§7be stored here.\n\n§7Gifts sent: §a0\n§7Gifts recieved: §a0\n\n§eClick to view your gift inventory!"));
        inventory.setItem(48, makeItemOther(Material.MAP, "§cOpen Multiple Items", 1, 0, "§7Open multiple items at the\n§7same time!\n\n§cNot available"));
        inventory.setItem(50, makeItemOther(Material.BOOK, "§aMystery Box Information", 1, 0, "§bMystery Boxes §7can contain almost any\n§7lobby cosmetic feature and Housing theme.\n§7To earn §bMystery Boxes§7, all you have to\n§7do is play minigames on the server!"));
        inventory.setItem(22, makeItemOther(Material.BARRIER, "§cNo Mystery Boxes", 1, 0, "§7Go find some mystery boxes\n§7to open!"));
        
        for (int slots = 0; slots < getSize(); slots++) {
            if (inventory.getItem(slots) == null) {
                inventory.setItem(slots, FILLER_GLASS);
            }
    }
    }
}