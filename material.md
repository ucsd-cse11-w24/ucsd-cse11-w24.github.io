---
layout: with-sidebar
title: "Lectures and Course Material – CSE8B"
---

<ul>
{% for lecture in site.lectures %}
<li><a title="{{ lecture.index }}" href="{{ lecture.url }}">{{ lecture.name }}</a></li>
{% endfor %}
</ul>