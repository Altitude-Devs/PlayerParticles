package com.esophose.playerparticles.gui;

import org.bukkit.inventory.Inventory;

import com.esophose.playerparticles.gui.PlayerParticlesGui.GuiState;

public class GuiInventory {

    private Inventory inventory;
    private GuiState guiState;

    public GuiInventory(Inventory inventory, GuiState guiState) {
        this.inventory = inventory;
        this.guiState = guiState;
    }

    /**
     * Replaces the current inventory with a new inventory
     * 
     * @param inventory The inventory this GuiInventory now manages
     */
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    /**
     * Updates the current GuiState
     * 
     * @param guiState The new GuiState
     */
    public void setGuiState(GuiState guiState) {
        this.guiState = guiState;
    }

    /**
     * Gets the Inventory
     * 
     * @return The Inventory
     */
    public Inventory getInventory() {
        return this.inventory;
    }

    /**
     * Gets the GuiState
     * 
     * @return The GuiState
     */
    public GuiState getGuiState() {
        return this.guiState;
    }

}
