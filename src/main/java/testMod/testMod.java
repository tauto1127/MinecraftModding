package testMod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


public class testMod {
    public static final String MODID = "testMod";
    public static final String NAME = "testMod";
    public static final String VERSION = "1.0";

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public void Init(FMLPreInitializationEvent event){
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
