package com.company.codewars6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Background
//        There was an Old Lady who Swallowed a Fly
//
//        There was an old lady who swallowed a fly;
//        I don't know why she swallowed a fly - perhaps she'll die!
//
//        There was an old lady who swallowed a spider;
//        That wriggled and jiggled and tickled inside her!
//        She swallowed the spider to catch the fly;
//        I don't know why she swallowed a fly - Perhaps she'll die!
//
//        There was an old lady who swallowed a bird;
//        How absurd to swallow a bird!
//        She swallowed the bird to catch the spider;
//        That wriggled and jiggled and tickled inside her!
//        She swallowed the spider to catch the fly;
//        I don't know why she swallowed a fly - Perhaps she'll die!
//
//        There was an old lady who swallowed a cat;
//        Fancy that she swallowed a cat!
//        She swallowed the cat to catch the bird,
//        She swallowed the bird to catch the spider;
//        That wriggled and jiggled and tickled inside her!
//        She swallowed the spider to catch the fly;
//        I don't know why she swallowed a fly - Perhaps she'll die!
//
//        There was an old lady that swallowed a dog;
//        What a hog, to swallow a dog!
//        She swallowed the dog to catch the cat,
//        She swallowed the cat to catch the bird,
//        She swallowed the bird to catch the spider;
//        That wriggled and jiggled and tickled inside her!
//        She swallowed the spider to catch the fly;
//        I don't know why she swallowed a fly - Perhaps she'll die!
//        `
//        There was an old lady who swallowed a goat;
//        She just opened her throat and swallowed a goat!
//        She swallowed the goat to catch the dog,
//        She swallowed the dog to catch the cat,
//        She swallowed the cat to catch the bird,
//        She swallowed the bird to catch the spider;
//        That wriggled and jiggled and tickled inside her!
//        She swallowed the spider to catch the fly;
//        I don't know why she swallowed a fly - Perhaps she'll die!
//
//        There was an old lady who swallowed a cow;
//        I don't know how she swallowed a cow!
//        She swallowed the cow to catch the goat,
//        She swallowed the goat to catch the dog,
//        She swallowed the dog to catch the cat,
//        She swallowed the cat to catch the bird,
//        She swallowed the bird to catch the spider;
//        That wriggled and jiggled and tickled inside her!
//        She swallowed the spider to catch the fly;
//        I don't know why she swallowed a fly - Perhaps she'll die!
//
//        There was an old lady who swallowed a horse;
//        ...She's dead, of course!
//
//        Kata Task
//        You are a forensic investigator attending a suspicious scene where an old lady has been found dead.
//
//        According to distressed witnesses she had been observed recklessly swallowing a variety of animals, just as in the nursery rhyme.
//
//        An autopsy is conducted, and some of the swallowed animals are found to be still alive!
//
//        But which ones?
//
//        INPUT
//
//        List of animals in the order the old lady attempted to swallow them
//        OUTPUT
//
//        List of animals found to be still alive inside the old lady (same order as swallowed)
//        Notes
//        As in the rhyme, swallowing a horse will cause immediate death
//        The swallowed animals can catch their prey before they too may be caught
//        Even though the rhyme does not say "She swallowed the horse to catch the cow" you should assume this was why she did it!


public class Animals {
    private static final List<String> ANIMALS = Arrays.asList(new String[]{"fly","spider","bird","cat","dog","goat","cow","horse"});

    public static List<String> oldLadySwallows(final List<String> animals) {
        final List<String> stomach = new ArrayList<>();

        for (final String animal : animals) {
            final int idx = ANIMALS.indexOf(animal);

            // Remove anything this animal eats
            if (idx > 0) {
                stomach.removeAll(Arrays.asList(ANIMALS.get(idx-1)));
            }

            // Add this animal (only if nothing present can eat it)
            if (idx == ANIMALS.size() - 1 || !stomach.contains(ANIMALS.get(idx+1))) {
                stomach.add(animal);
            }

            // Swallowing a horse kills the old lady straight away :-(
            if ("horse".equals(animal)) {
                break;
            }
        } // for

        return stomach;
    }
}
