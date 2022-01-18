package com.tyranotyrano.structural.bridge;

import com.tyranotyrano.structural.bridge.abstraction.Attacker;
import com.tyranotyrano.structural.bridge.abstraction.GameCharacter;
import com.tyranotyrano.structural.bridge.abstraction.Healer;
import com.tyranotyrano.structural.bridge.abstraction.Tanker;
import com.tyranotyrano.structural.bridge.implementor.AttackerSpecialSkill;
import com.tyranotyrano.structural.bridge.implementor.HealerSpecialSkill;
import com.tyranotyrano.structural.bridge.implementor.TankerSpecialSkill;

public class BridgeMain {

    public static void main(String[] args) {
        // 1. 어태커
        GameCharacter attacker = new Attacker(new AttackerSpecialSkill());
        attacker.useNormalSkill();
        attacker.useSpecialSkill();

        System.out.println();

        // 2. 탱커
        GameCharacter tanker = new Tanker(new TankerSpecialSkill());
        tanker.useNormalSkill();
        tanker.useSpecialSkill();

        System.out.println();

        // 3. 힐러
        GameCharacter healer = new Healer(new HealerSpecialSkill());
        healer.useNormalSkill();
        healer.useSpecialSkill();
    }
}
