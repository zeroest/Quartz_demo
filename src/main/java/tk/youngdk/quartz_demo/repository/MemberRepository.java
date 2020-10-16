package tk.youngdk.quartz_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tk.youngdk.quartz_demo.domain.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
