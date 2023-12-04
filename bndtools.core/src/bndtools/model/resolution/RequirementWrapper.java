package bndtools.model.resolution;

import java.util.Collection;
import java.util.Objects;

import org.osgi.resource.Requirement;

public class RequirementWrapper {

	public Requirement					requirement;
	public boolean						resolved;
	public boolean						java;
	public Collection<? extends Object>	requirers;

	@Override
	public int hashCode() {
		return Objects.hash(java, requirement, requirers, resolved);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequirementWrapper other = (RequirementWrapper) obj;
		return java == other.java && Objects.equals(requirement, other.requirement)
			&& Objects.equals(requirers, other.requirers) && resolved == other.resolved;
	}

	@Override
	public String toString() {
		return "RequirementWrapper [resolved=" + resolved + ", java=" + java + ", requirement=" + requirement + "]";
	}

}
