package me.zero.skyblock.npcs.park;

import me.zero.mortar.npc.MortarNPC;
import me.zero.mortar.npc.NPCInteractionEvent;
import me.zero.mortar.npc.NPCMeta;
import org.bukkit.ChatColor;
import java.util.Arrays;
public class Melody extends MortarNPC {
    public Melody() {
        super(new NPCMeta() {
            @Override
            public String getName() {
                return "Melody";
            }
            @Override
            public int getId() {
                return 106;
            }
            @Override
            public String getSignature() {
                return "wUgPl5j42AXlnQnT2z1TCVg7rBcxi3dxcB5tJt6Hb+N9V3MlgUH1mtcSE88wClQxb1i9qlqqIk+R2UPaNf74xwxRqLELufuZ/JOCstsKrjQPY3t8nm3Xx6b101h8sm+5MpemFajF5j4ZC73mMk99HsEdGwWNGkV+oFl5+0lmyxO5mFcxPO15jrj2ZsjUH4rQQJRdaMNC6B1EBBsPQaVVG0nQV5/Mk2r4R1iTTXOSSn9ygtgkjlCMlLyrrE+1SdoD5015iDouXsqxpTXkngrtZLTEyTmo4GvqR5M+iMgEAj8aD4np0AEU4WgZ7dAMwCiYFFSXXigQxjwVxzQUX/6ZrYTdTNYnHSoCf6p2hc2vkabMS8aopJ4w5/e7Z4KM1rv3yn+umn5Hb42a8rcbOL7QWxuE5naFS9TZHn0WPl9CtLi2Yqv1YKy6hiVhv47r2++jOLYRoWCcA47aBi6vP/XRl20SUUSoK3+mnblnqF3wCUR0Z7xi2NLXDVzXz49CitDKhCN3Ve6nbkVgab1SXBkyl0qkY50k8v0nXtOd9wWmFSOSHiGxFB/pctwf+vx16BiydPRIluOhlFklBw6lMgzsG4NFhPfne4eV4YYt0HmkC86MsPpvzRgbnGWwBgPl7G9f3owOU4ilvMd9ea4+41EcCsB3sE23qfzR+7+17G7jRlI=";
            }
            @Override
            public String getTexture() {
                return "eyJ0aW1lc3RhbXAiOjE1ODcwMTU4MTQ5NTIsInByb2ZpbGVJZCI6ImIwZDRiMjhiYzFkNzQ4ODlhZjBlODY2MWNlZTk2YWFiIiwicHJvZmlsZU5hbWUiOiJNaW5lU2tpbl9vcmciLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzRkMjM4Y2NjODE4YWIwYzBmZGViZDA3ZDRhNTZjMzUzZmY1ZWI1NDFjODVkMzg2MzYyMTYxNzgxZDFkZDc0Y2MifX19";
            }
            @Override
            public String getDisplayName() {
                return "Melody";
            }
            @Override
            public String getWorldName() {
                return "world";
            }
            @Override
            public double getX() {
                return -389.5D;
            }
            @Override
            public double getY() {
                return 110D;
            }
            @Override
            public double getZ() {
                return 35.5D;
            }
            @Override
            public float getYaw() {
                return -89.8F;
            }
            @Override
            public float getPitch() {
                return 0.2F;
            }
            @Override
            public boolean canLook() {
                return true;
            }
        });
    }
    @Override
    public void onInteract(NPCInteractionEvent event) {

     
    }
}