package com.rcjrrjcr.bukkitplugins.BuyAbilities.EconomyInterface;

import org.bukkit.entity.Player;


public interface IEconHandler
{
	public double getBalance(Player player);
	public boolean deduct(Player player, Integer cost);
	public double getBalance(String playerName);
	public boolean deduct(String playerName, Integer cost);
}
