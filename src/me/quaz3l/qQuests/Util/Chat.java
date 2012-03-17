package me.quaz3l.qQuests.Util;

import me.quaz3l.qQuests.qQuests;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Chat {
	// General Message
	public static void message(Player p, String msg)
	{
		p.sendMessage(qQuests.plugin.chatPrefix + msg);
	}
	public static void message(CommandSender s, String msg)
	{
		s.sendMessage(qQuests.plugin.prefix + msg);
	}
	
	// Message With No Former Formatting
	public static void noPrefixMessage(Player p, String msg)
	{
		p.sendMessage(ChatColor.LIGHT_PURPLE + msg);
	}
	public static void noPrefixMessage(CommandSender s, String msg)
	{
		s.sendMessage(ChatColor.LIGHT_PURPLE + msg);
	}
	
	// A Good Message For Successes
	public static void quotaMessage(Player p, String msg, Integer currentAmount, Integer totalAmount, String unit)
	{
			p.sendMessage(qQuests.plugin.chatPrefix + ChatColor.LIGHT_PURPLE + msg + " " + ChatColor.GREEN + currentAmount + "/" + totalAmount + " " + unit);
	}
		
	// Red Error With Prefix
	public static void error(Player p, String msg)
	{
		p.sendMessage(qQuests.plugin.chatPrefix + ChatColor.RED + msg);
	}
	
	// A Good Message For Successes
	public static void green(Player p, String msg)
	{
		p.sendMessage(qQuests.plugin.chatPrefix + ChatColor.GREEN + msg);
	}
	
	// No Permissions Message
	public static void noPerms(Player p)
	{
		p.sendMessage(ChatColor.RED + Texts.NO_PERMISSION);
	}
	public static void noPerms(CommandSender s)
	{
		s.sendMessage(ChatColor.RED + Texts.NO_PERMISSION);
	}
	
	// Logger
	public static void logger(String lvl, String s)
	{
		if(lvl.equalsIgnoreCase("info"))
			qQuests.plugin.logger.info(qQuests.plugin.prefix + s);
		else if(lvl.equalsIgnoreCase("warning"))
			qQuests.plugin.logger.warning(qQuests.plugin.prefix + s);
		else if(lvl.equalsIgnoreCase("severe"))
			qQuests.plugin.logger.severe(qQuests.plugin.prefix + s);
		else
			qQuests.plugin.logger.warning(qQuests.plugin.prefix + s);
	}
	
	// Parses Error Codes To Phrases
	public static String errorCode(Integer code)
	{
		switch(code)
		{
		case 0:
			return "Success";
		case 1:
			return null;
		case 2:
			return Texts.NOT_ENOUGH_FOR_QUEST;
		case 3:
			return Texts.HAS_ACTIVE_QUEST;
		case 4:
			return Texts.TASKS_NOT_COMPLETED;
		case 5:
			return Texts.NOT_ENOUGH_MONEY;
		case 6:
			return Texts.NOT_ENOUGH_HEALTH;
		case 7:
			return Texts.NOT_ENOUGH_FOOD;
		case 8:
			return Texts.NOT_ENOUGH_ITEMS;
		case 9:
			return Texts.NO_ACTIVE_QUEST;
		case 10:
			return Texts.DELAY_NOT_FINISHED;
		default:
			return "Unknown";
		}
	}
}
