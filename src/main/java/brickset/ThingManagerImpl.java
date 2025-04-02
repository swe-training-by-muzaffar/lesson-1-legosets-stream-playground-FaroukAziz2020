package brickset;

import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.Set;

public class ThingManagerImpl implements LegoSetInterface {
    public static void main(String[] args) {
        var manager = new ThingManagerImpl();
    }
    /**
     * @return list of 1000 legosets
     */
    @Override
    public List<LegoSet> getLegoSets() {
        return LegoSetInterface.super.getLegoSets();
    }

    /**
     * Prints ascending order sorted themes where its tag has "Astronomy". Hint: There are tags that may be null
     */
    @Override
    public void printAllThemesByTag() {

    }

    /**
     * Gets statistics according to Theme
     *
     * @param theme is given
     * @return summary statistics by theme
     */
    @Override
    public LongSummaryStatistics getSummaryStatisticsOfPiecesByTheme(String theme) {
        return null;
    }

    /**
     * @return an average pieces by a theme "Icons"
     */
    @Override
    public Double getAvgPiecesOfIcons() {
        return 0.0;
    }

    /**
     * Gets sum of pieces by theme
     *
     * @return Map of String(theme) and Integer(sum pieces)
     */
    @Override
    public Map<String, Integer> getSumOfPiecesByTheme() {
        return Map.of();
    }

    /**
     * @return Map of themes that mapped to sub themes that itself mapped to LegoSet
     */
    @Override
    public Map<String, Map<String, Set<LegoSet>>> getLegoSetByThemeThenBySubtheme() {
        return Map.of();
    }
}
