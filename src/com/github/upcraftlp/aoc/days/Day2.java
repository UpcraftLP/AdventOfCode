package com.github.upcraftlp.aoc.days;

import com.github.upcraftlp.aoc.util.Day;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;

public class Day2 extends Day {

    private static final String INPUT = "lsrivfotzgdxpkefaqmuiygchj\nlsrivfotzqdxpkeraqmewygchj\nlsrivfotzbdepkenarjuwygchj\nlsrivfotwbdxpkeoaqmunygchj\nlsrijfotzbdxpkenwqmuyygchj\nlsrivfotzbdxpkensqsuwygcdj\nlsrivfotubdxpkenzqmuwyschj\nlsrjvwotzbdxpkenaqjuwygchj\nlsrtvfotzbdxpkeaaqmuqygchj\nlscivzotzbdxpkenaqmuwygcnj\nddrivfotzbdxpkenlqmuwygchj\njsrivfvtzbdxpkenaqmufygchj\ncsrivfotzxdxpkenaqguwygchj\nlprivfbtzbqxpkenaqmuwygchj\nlsrnvfotzbnxpkenaqmuwygchk\nlsiivfotzbdhpkencqmuwygchj\nlsrivfotzbyxpkenaqmzwygchc\nlsjivfotqbdxpvenaqmuwygchj\nlsrivfotzbdxpkencqmuwvgqhj\nlsrivfotzhdxpqenaqouwygchj\nlsrivfytzbnxpkenaqmuwygcsj\nllrivfotzbdxpkenaqmuwynchd\nlsuivfotzbdxpnenaqmuwygchk\nlsrtvootnbdxpkenaqmuwygchj\nysrivfotzcdxpkenaqmuwhgchj\nlsrivfotxbdxpkefgqmuwygchj\nlsrmvfotzbaxpkenaqmuwygfhj\nlsrivfothbyxpkxnaqmuwygchj\nisrivfotzbdxpkenaqmkwygcht\nlhrivfotzbdxpkbnfqmuwygchj\nlsrivfotzbmxpkenaqmuwbgdhj\nlsrivvotzbdxcoenaqmuwygchj\nssrwvfotzbdjpkenaqmuwygchj\nlsrivfotgbwxpkenaqmhwygchj\nlsrivfotzbdxpkenaqcuhygcyj\nlcdivfotzbdxpkenaqmuwxgchj\nysbivfotzbdxpkenaqmuwkgchj\nlsrivfltzbdxxkenaqcuwygchj\nlsrivfotzbdxpkgnaqmunegchj\nfsqpvfotzbdxpkenaqmuwygchj\nlsriifotzbcxpkenaqmubygchj\nlsrivfotzjdxpkenaqmugygcjj\ntsrikfotzbdxpkeneqmuwygchj\nlarivfotzbdxpkenaqmwwygcpj\nlarivfotzbdxpkenaqmuayrchj\nlsravfotzbdxpkdoaqmuwygchj\nlsrivfotzbixpkenaqvtwygchj\nlsrixfotnbdxtkenaqmuwygchj\nlsrirfotzbdxpkeneqmuwygchv\nlsrivfofzedxpkenaqmswygchj\nlwrivfotzvdxpkenaqmuwygfhj\nlsrivfotzbdapkenaqmuqygehj\nlsrizfotgbdxpkenaqjuwygchj\nlsrivioxzbdxpkanaqmuwygchj\nlsrivfmtzbdxpkgnaqmuwcgchj\nlsrivfotzbdxpkeaaqmuofgchj\nlsrivfotvbdxpkenuqmuwygcht\nlsrivfothcdxpkenaqouwygchj\nlsgivfotzbdxpkenawmuwygchi\nlsrigfotzbdxpmonaqmuwygchj\nlsrivfotzbdxrkfnaqmuwygcha\nlsrivfopobdxpkenaqmuwygchv\nlsrejfotzbdxpkvnaqmuwygchj\nlsrivfotzbdxplenqqmuwygchz\nlsmivfotzbdppkebaqmuwygchj\nlsrivfotubdipkewaqmuwygchj\nlsrivfodnbhxpkenaqmuwygchj\nlsrivfotzbdxpkenaqmkwzgshj\nlsrixfotzbdxpkensqmuwygohj\nlsdivfotzbdxpkenaqmuwagcwj\nlsrimfotzbdxpkenaqmuwygcyu\nasnivfotzbdxpkenaqmbwygchj\nlseivfltfbdxpkenaqmuwygchj\nlsrivfbtzbdxpuenaqmuwyychj\nlsziafozzbdxpkenaqmuwygchj\nlsrivfotzbdxpkwnaomuwygchg\nldrivfotzbdxpkeniqmuwygihj\nlsrivfotzbdxpkenaqhdwycchj\nlsrigfotzbdxphenaqmuwynchj\nlsripfotzbdxpgenaqmuwygchh\nlsrgvfoczbdxpkenaqmuwygihj\nlsribfotzbgxpkenaqhuwygchj\nlsrkvfotztdxpienaqmuwygchj\nlsrivfohzbdxpkenaqrxwygchj\nlsrivfoszbdxpkenavmuwygvhj\nlsrivfstzblxpkcnaqmuwygchj\nlzrivfotzbdxpkegaqmuwygchv\nlsrivtotzbdxpkenaqrumygchj\nlsgivfotzbdwpkenaqmuwhgchj\nlurivfotybdxpkenaqmuwygchg\nlsrivfogzbdxpkmnrqmuwygchj\nlsrivgotzbdxpkengqmuwygcwj\nlirivfbyzbdxpkenaqmuwygchj\nlwrivfotzbdxpkbjaqmuwygchj\nlsrivkotzbqxakenaqmuwygchj\nlxrivfotzbdxpkenaqmuwygshy\nlxxivfqtzbdxpkenaqmuwygchj\nlsrivfohzbdxpzenaqmuzygchj\nlsrivfotzndxekenaqmuwygcvj\nlsrdvfotzbdxpkenaqguiygchj\nlsrivfotzbdxpiehaqauwygchj\natrivfotzbdxpkenaqmuwygchz\nlsrivfovzbdxpkenaqmuvygcwj\nlsrivfotzmdxpkennqmuwyxchj\nluvcvfotzbdxpkenaqmuwygchj\nlsriqfotzbdxpbenaqmuwygchg\nbsoivfotzudxpkenaqmuwygchj\nlsrivfotzbdxphenaqmhwxgchj\nlsrivfotzbdxpkenasmuwjgchw\nlsrivdotzboxpkenaqmuwykchj\nlsqivfotzbdxcdenaqmuwygchj\nlsrivfktzndypkenaqmuwygchj\nlwrivfotzbdxpkenaqmuolgchj\nlkrivfowzbdxpkenaqmbwygchj\nlsrivhotzbdxpkenaqyuwygvhj\nlsruvfotzbdxpkecaqmukygchj\nlsrivdotzbdsskenaqmuwygchj\nlsrivfotzbdxpkanaqmuwygcmc\nlsrgvfotubdxpkenrqmuwygchj\npsrivfotzbdxpkenaqmutygchd\nlsrivfitzbdxpkenagmiwygchj\nlsrivfotzbdxpkbnaqauwyrchj\nlsrivfotvbdxpjenaqmuwygchr\nlsrdvfoyzbjxpkenaqmuwygchj\nvsrivfothbdxpkenaqmuwyychj\nlyrivfotzpdxpkepaqmuwygchj\nlsgbqfotzbdxpkenaqmuwygchj\nlxrivfotzbdxpkenegmuwygchj\nlsrivfokzbdxpkenaqnuwyxchj\nlsrivfotubmxpkexaqmuwygchj\nlswivfvtzbdxpkenaqmuwygcgj\nlsrivfonzbdxpkenaqiuwygchc\nisrivlotzbdxpkenaqmuwygchf\nlsrilfozzbdxpkenaqmuwygcvj\nwsrivfotzbdxpkepaqmuwegchj\nlsrivfrtzbrxpkenaqquwygchj\nlsrivfotzbdxpkeqaqmuoygjhj\nlsrivfotzmdxpkenaqmuwyxchg\nlsrnvfotzbzxxkenaqmuwygchj\nldrivfotzbdxpkenaqmlxygchj\nlsriofotzbdxpkenaqmwwmgchj\nlsrivfotzodxjkenaqmuwyglhj\nlsriviotzbdxpkegaqguwygchj\nlsrimfotzbdxpkanaqmuwygshj\nlwrzvfotzbdxpkenaqmuwygcfj\nlirivfotzbdxkkenvqmuwygchj\nlsrivfotlbdxpkeoaqmuwygahj\nlsxivfotzbdxpkenaqmuwwgchi\nlsrivfotzbdxpkenaqmukygzzj\nlsrtvfotzbdxskenaqmuwygcij\nlsgilfotzbdxpdenaqmuwygchj\nlsriyfotbbdxpkenaqmuwygchm\nlsrivfotabdxpkenaqmuwyghhs\nxsrizfotzbdxpkenaqmuwygczj\nlsrivfotybdxpkenaqquwygchx\nlsrzvfofzbdxpktnaqmuwygchj\nxsripfotzbdxpkenaqmqwygchj\nlsrivfotzbdspkenahmuwugchj\nlsmivfotzbdbpkenaqmuwygchy\nlsruvfotzbdxpkenaqqpwygchj\nlrmivfotzbdxpkenaqguwygchj\nlsnivfotzbdlpketaqmuwygchj\nlsrivfotzbdxjketaqjuwygchj\nlsrivxotzbdchkenaqmuwygchj\nlsrivootzbdxpkenaqmuwybmhj\ntsrivfdtzbdxpkenaqmuwpgchj\nlsrivmotzbdxpkxnaqmuwcgchj\nlsrivfotzadepkenaqmuwyichj\ndsrivfotrbdxpkenaqmuwtgchj\nlsrivfhtzbdxvkenoqmuwygchj\nlsrivfotzvdxbkenaqmbwygchj\nlsrxvcotzbdxpkenaqmuwygvhj\nlsrivfotzbdxykenaqmuwfgcha\nlsbivfotzbdxpkenaqmuwfvchj\nlfrivfotzbdcpkgnaqmuwygchj\nlsrivfotzbdxpwegdqmuwygchj\nlsrivfotyjdupkenaqmuwygchj\ngsrivfotzbdxpkenaemuwcgchj\nlsrivfodqbdxpkenaqmuwygchg\nlsrivfoczbdxpkenaqnuwwgchj\nlsrivpouzbhxpkenaqmuwygchj\nllbivuotzbdxpkenaqmuwygchj\nlfrivfofzbdxpkenaqmuwygchb\nlsrivfotzbdxpkenaumuwgghhj\nlsrivfotzbdxqaenazmuwygchj\nlsrivfotzbgxpkenkqmqwygchj\nlsrivfotzbdxpkensqiawygchj\nljrijfotzbdxppenaqmuwygchj\nlsrivfoszbdxpkrnlqmuwygchj\nlsrijfotzbdxpcfnaqmuwygchj\nlsrivfotzbdopkebaqmuwytchj\nlsrivfonzbdxnkenalmuwygchj\nlarivfouzbvxpkenaqmuwygchj\nlsryvfotzbdxpkensqmuwygyhj\nlsrivfztzbdxpkenaxmuwigchj\nlqkivfotzbdxpkenaqmuwygcht\nwsdivfotzbdxpkenbqmuwygchj\nlsrlvfotzadxpkencqmuwygchj\nlsrivfotoohxpkenaqmuwygchj\nlsrivfbuzbdfpkenaqmuwygchj\npsrivfotzbdxpkenawmuqygchj\nlsrivmotzbdxpkxnaqmuwcychj\nlsrivfotzvdgpkenaqmuwlgchj\nlcfivfstzbdxpkenaqmuwygchj\nlsrivfotzbddpkeeaqmuwygcij\nlsribfotzbdxpkenaqmuwugcyj\nlsrivfotzbdxakenaqmkwygyhj\nlsrivfotzbdxpkegaqmupyvchj\nlfrivfitzbdxpkenaqmuwygcrj\nlskivfotzbdxpkenaqmuwygwwj\nlsrivfotzddnpkenaqmuwfgchj\nlsrivfotzbdiukhnaqmuwygchj\nlfrivfotzbdxpkendqmuwygctj\nljriqfotzvdxpkenaqmuwygchj\nlsrivfotzbdxpkeskqpuwygchj\nlsrivfotzbdxpkehaqmupygghj\nlsriyfotsbdxpkedaqmuwygchj\nlsrivfotzbdsjsenaqmuwygchj\nlsrivfotzbwxpienaqmuaygchj\nlsrivrotzbdxpkenaumuwygahj\nlsrivpotzfdxpkenaqmuwyjchj\nlsrivfomebdxpoenaqmuwygchj\nlswigfotpbdxpkenaqmuwygchj\nlsrivnotzbdxpkenaqmufrgchj\nlsrivfolbbdxpkenaqmuwygcqj\nlirivfotzbdxpknnaqeuwygchj\nlsrrvfxtzbdxpaenaqmuwygchj\nlspivfotzbdxpnsnaqmuwygchj\nlsrivfotzbyxpkenaqmawygcij\nlsrivfotzbfxpbenaqmuwyichj\nlsrivfotzbvxpjeyaqmuwygchj\nlyrihfotzbdxpknnaqmuwygchj\nuurivfotzbdxpkenaqmubygchj\nlsrivfotgbdxnkenaxmuwygchj\nlsriffotzbdxpkdnaqmuwygshj\nlsrisfotzbdxpkenaqzjwygchj\nlsrilfotzbdxpkenaqmuwygtgj\nlsrivfotzbdxzkenaqmuhmgchj\nhsrivfotzbdxprenaqauwygchj\ntsrevfotzbdupkenaqmuwygchj\nlsrizfotzbpxpkenaqmuwyrchj\nlsdivfotzbxxpkenaqmuhygchj\nlsrivfttzbyxpkenaqmuaygchj\nlsrivfotzodxpwenaqzuwygchj\nlsrivfotfbdxpkenaqvuwygyhj\nlsrivfotzzdxpknnaqmulygchj\nlsrjvvotzbdxpkenaqmuwjgchj\nlsrivuotzbdxpkeiaqxuwygchj\nlsrivfotzbdxpzenaqmmwygthj\nlsrivfotzbdxphenaqmuwyghvj";

    @Override
    protected void doPartA() {
        AtomicInteger twoLetters = new AtomicInteger();
        AtomicInteger threeLetters = new AtomicInteger();
        Arrays.stream(INPUT.split("\n")).forEach(s -> {
            Map<Integer, Integer> counts = new HashMap<>();
            s.chars().forEach(c -> counts.put(c, counts.getOrDefault(c, 0) + 1));
            if(counts.values().stream().anyMatch(in -> in == 2)) twoLetters.getAndIncrement();
            if(counts.values().stream().anyMatch(in -> in == 3)) threeLetters.getAndIncrement();
        });
        System.out.printf("Checksum: %s", twoLetters.get() * threeLetters.get());
    }

    @Override
    protected void doPartB() {
        String[] in = INPUT.split("\n");
        loop:
        for(int i = 0; i < in.length - 1; i++) {
            for(int j = i; j < in.length - 1; j++) {
                int diff = findOneDiff.apply(in[i], in[j]);
                if(diff >= 0) {
                    System.out.printf("Found Pair: %s, %s, Difference at index %s (%s, %s), common letters: %s", in[i], in[j], diff, in[i].charAt(diff), in[j].charAt(diff), in[i].substring(0, diff).concat(in[i].substring(diff + 1)));
                    break loop; //we're done
                }
            }
        }
    }

    private static final BiFunction<String, String, Integer> findOneDiff = (s1, s2) -> {
        if(s1.length() != s2.length()) return -1;
        int diff = -1;
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                if(diff != -1) return -1;
                diff = i;
            }
        }
        return diff;
    };
}
