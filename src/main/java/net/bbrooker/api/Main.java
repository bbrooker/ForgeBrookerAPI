package net.bbrooker.api;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/** @author Tanawat */
@Mod(modid = Main.id, name = Main.name, version = Main.ver, modLanguage = Main.lang)
public class Minespace {


    /** server and client && instance mod */
    @SidedProxy(serverSide="net.bbrooker.api.Clientproxy", clientSide="net.bbrooker.api.Commproxy")
    public static Commproxy proxy;
    
    public static SimpleNetworkWrapper netmod; 
    
    @Instance("Main")
    public static Main intance;
    
    public static final String id = "api";
    public static final String name = "API";
    public static final String version = "1.0";
    public static final String lang = "TH";
    
    //@Mod information
    public static String author = "Tanawat Boonmak, Henry Foster, Diana Lyons";
    public static String url = "www.facebook.com/MineZRoleplay";
    public static String comm_proxy = "net.bbrooker.api.Commproxy";
    public static String client_proxy = "net.bbrooker.api.Clientproxy";
    
  /****** item class ******/
  
  //define custom item here
  public static Item A01;  
  public static Item A02;    
  public static Item A03;    
  public static Item A04;  
  
  public static Item B01;  

  
  //tabs
  public static CreativeTabs Tab01;
  public static CreativeTabs Tab02;
  public static CreativeTabs Tab03;
  public static CreativeTabs Tab04;
  
  @EventHandler
  public void preInit(FMLPreInitializationEvent e)
  {
      Tab01 = new Tabtest1("Test1");
    	Tab02 = new Tabtest2("Test2");
    	Tab03 = new Tabtest3("Test3");
    	Tab04 = new Tabtest4("Test4");

  }
  
  @EventHandler
  public void Init(FMLInitializationEvent e)
  {
      A01 = new Itemmaterials("test1");GameRegistry.registerItem(A01, "test1");LanguageRegistry.addName(A01, EnumChatFormatting.AQUA + "test");
      A02 = new Itemmaterials("test2");GameRegistry.registerItem(A02, "test2");LanguageRegistry.addName(A02, EnumChatFormatting.AQUA + "test2");
      A03 = new Itemmaterials("test3");GameRegistry.registerItem(A03, "test3");LanguageRegistry.addName(A03, EnumChatFormatting.AQUA + "test3");
      A04 = new Itemmaterials("test4");GameRegistry.registerItem(A04, "test4");LanguageRegistry.addName(A04, EnumChatFormatting.AQUA + "test4");
      //B
      B01 = new Itemtest("test");GameRegistry.registerItem(B01, "B01");
    
    
  }
  
  @EventHandler
  public void postInit(FMLPostInitializationEvent event)
  {
    
  proxy.registerInformation();
  }

  
}
  
