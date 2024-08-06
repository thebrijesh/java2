package LLD.Design_Patterns.Registry_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        Plugin spellChak = new SpellCheckPlugin();
        Plugin grammer = new GrammarCheckPlugin();

        PluginRegistry registry = PluginRegistry.getInstance();
        registry.registerPlugin("spellcheck",spellChak);
        registry.registerPlugin("grammercheck", grammer);

        // Retrieve and execute plugins
        Plugin retrievedSpellCheckPlugin = registry.getPlugin("spellcheck");
        if (retrievedSpellCheckPlugin != null) {
            retrievedSpellCheckPlugin.execute();
        }

        Plugin retrievedGrammarCheckPlugin = registry.getPlugin("grammercheck");
        if (retrievedGrammarCheckPlugin != null) {
            retrievedGrammarCheckPlugin.execute();
        }
    }
}
