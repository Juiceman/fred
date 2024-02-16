package freenet.pluginmanager;

/**
 * A Fred plugin that has a version.
 * This is a user-presentable version, a marketing version, a string,
 * not necessarily easy to compare! Like "1.0.3". Whereas a real version would be 103.
 *
 * @author dbkr
 * @see FredPluginRealVersioned for real versions.
 */
public interface FredPluginVersioned {
	String getVersion();
}
