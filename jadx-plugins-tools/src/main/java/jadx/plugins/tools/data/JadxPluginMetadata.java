package jadx.plugins.tools.data;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JadxPluginMetadata implements Comparable<JadxPluginMetadata> {
	private String pluginId;
	private String name;
	private String description;
	private String homepage;
	private @Nullable String requiredJadxVersion;

	private @Nullable String version;
	private String locationId;
	private String jar;
	private boolean disabled;

	public String getPluginId() {
		return pluginId;
	}

	public void setPluginId(String pluginId) {
		this.pluginId = pluginId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public @Nullable String getVersion() {
		return version;
	}

	public void setVersion(@Nullable String version) {
		this.version = version;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public @Nullable String getRequiredJadxVersion() {
		return requiredJadxVersion;
	}

	public void setRequiredJadxVersion(@Nullable String requiredJadxVersion) {
		this.requiredJadxVersion = requiredJadxVersion;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getJar() {
		return jar;
	}

	public void setJar(String jar) {
		this.jar = jar;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof JadxPluginMetadata)) {
			return false;
		}
		return pluginId.equals(((JadxPluginMetadata) other).pluginId);
	}

	@Override
	public int hashCode() {
		return pluginId.hashCode();
	}

	@Override
	public int compareTo(@NotNull JadxPluginMetadata o) {
		return pluginId.compareTo(o.pluginId);
	}

	@Override
	public String toString() {
		return "JadxPluginMetadata{"
				+ "id=" + pluginId
				+ ", name=" + name
				+ ", version=" + (version != null ? version : "?")
				+ ", locationId=" + locationId
				+ ", jar=" + jar
				+ '}';
	}
}
