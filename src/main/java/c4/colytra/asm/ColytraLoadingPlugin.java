/*
 * Copyright (c) 2017 <C4>
 *
 * This Java class is distributed as a part of Colytra.
 * Colytra is open source and licensed under the GNU General Public License v3.
 * A copy of the license can be found here: https://www.gnu.org/licenses/gpl.txt
 */

package c4.colytra.asm;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import java.util.Map;

public class ColytraLoadingPlugin implements IFMLLoadingPlugin {

    public static boolean runtimeDeobf = false;

    @Override
    public String[] getASMTransformerClass() {
        return new String[]{ElytraTransformer.class.getName()};
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
        runtimeDeobf = (Boolean) data.get("runtimeDeobfuscationEnabled");
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
