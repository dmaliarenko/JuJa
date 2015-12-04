package com.juja.woland;

/**
 * Created by woland on 21.11.15.
 */
public class BitUtils {
    public static byte swapBits(byte b, int i, int j) {
        int l,r;

        int pl, bl, pm, br, pr;

        l=Math.max(i, j);
        r=Math.min(i, j);

        pl = b;
        bl = b;
        pm = b;
        br = b;
        pr = b;

        pl = pl >>> (l + 1);
        pl = pl << (l + 1);

        pm = pm << (32 - l);
        pm = pm >>> (32 - l);
        pm = pm >>> (r+1);
        pm = pm << (r+1);

        if ( r == 0) {
            pr = (byte) 0;
        } else {
            pr = pr << (32 - (r));
            pr = pr >>> (32 - (r));

        }

        bl = bl >>> l;
        bl = bl << l;
        bl = bl << (32 - (l+1));
        bl = bl >>> (32 - (l+1));
        bl = bl >>> (l-r);

        br = br >>> r;
        br = br << r;
        br = br << (32 - (r+1));
        br = br >>> (32 - (r+1));
        br = br << (l-r);

        String res_pl = String.format("%8s", Integer.toBinaryString(pl & 0xFF)).replace(' ', '0');
        System.out.println("pl: " + res_pl);

        String res_bl = String.format("%8s", Integer.toBinaryString(bl & 0xFF)).replace(' ', '0');
        System.out.println("bl: " + res_bl);

        String res_pm = String.format("%8s", Integer.toBinaryString(pm & 0xFF)).replace(' ', '0');
        System.out.println("pm: " + res_pm);

        String res_br = String.format("%8s", Integer.toBinaryString(br & 0xFF)).replace(' ', '0');
        System.out.println("br: " + res_br);

        String res_pr = String.format("%8s", Integer.toBinaryString(pr & 0xFF)).replace(' ', '0');
        System.out.println("pr: " + res_pr);

        byte bnew = (byte) (pl | bl | pm | br | pr );

        String res_bnew = String.format("%8s", Integer.toBinaryString(bnew & 0xFF)).replace(' ', '0');
        System.out.println("bnew: " + res_bnew);

        return (byte) bnew;
    }

    public static void main(String[] args) {
        byte result = swapBits((byte) 0b1111_0001, 0, 1);

        String res = String.format("%8s", Integer.toBinaryString(result & 0xFF)).replace(' ', '0');
        System.out.println(res);

        int x = 0b00000011_00000100 >> 1;

        String resx = String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
        System.out.println("resx: " + resx);

    }
}
